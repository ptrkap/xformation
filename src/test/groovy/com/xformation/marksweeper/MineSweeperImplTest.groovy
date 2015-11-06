package com.xformation.marksweeper

import spock.lang.Specification

/**
 * Created by PK on 11/6/2015.
 */
class MineSweeperImplTest extends Specification {

    MineSweeper mineSweeper = new MineSweeperImpl()

    def "should generate hint-field based on mine-field"() {
        given:
        def mineFieldString =
                "*...\n" +
                "..*.\n" +
                "...."

        when:
        mineSweeper.mineField = mineFieldString

        then:
        mineSweeper.hintField ==
                "*211\n" +
                "12*1\n" +
                "0111"
    }

    def "should generate single hint-field based on single mine-field - specific scenario with mine"() {
        given:
        def mineFieldString = "*"

        when:
        mineSweeper.mineField = mineFieldString

        then:
        mineSweeper.hintField == "*"
    }

    def "should generate single hint-field based on single mine-field - specific scenario without mine"() {
        given:
        def mineFieldString = "."

        when:
        mineSweeper.mineField = mineFieldString

        then:
        mineSweeper.hintField == "0"
    }

    def "should throw IllegalStateException because of not initialized mine-field"() {
        when:
        mineSweeper.getHintField()

        then:
        def e = thrown(IllegalStateException)
        e.message == "mine field is not initialized"
    }

    def "should throw IllegalArgumentException because of not properly formatted mine-field string - rows length varies"() {
        when:
        mineSweeper.mineField = mineFieldString

        then:
        def e = thrown(IllegalArgumentException)
        e.message == "All rows have to have the same length"

        where:
        mineFieldString << [
                "*...\n..*.\n...",
                "...\n..*.\n...",
                "*...\n..*.\n..."
        ]
    }

    def "should throw IllegalArgumentException because of not properly formatted mine-field string - unexpected chars"() {
        when:
        mineSweeper.mineField = mineFieldString

        then:
        def e = thrown(IllegalArgumentException)
        e.message == "Only [*, .] are allowed"

        where:
        mineFieldString << [
                "*...\n..*.\n.s..",
                "....\nz.*.\n....",
                "x.c.\nk.*.\n...."
        ]
    }
}
