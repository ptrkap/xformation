package com.xformation.marksweeper

import spock.lang.Specification

/**
 * Created by PK on 11/5/2015.
 */
class MineFieldParserTest extends Specification {

    def mineFieldParser = new MineFieldParser();

    def "should create mine-field"() {
        given:
        def mineFieldString = "*...\n..*.\n...."

        when:
        def mineField = mineFieldParser.parse(mineFieldString)

        then:
        mineField == [
                ['*', '.', '.', '.'],
                ['.', '.', '*', '.'],
                ['.', '.', '.', '.']
        ]
    }

    def "should throw IllegalArgumentException because of not properly formatted mine-field string - rows length varies"() {
        when:
        mineFieldParser.parse(mineFieldString)

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
        mineFieldParser.parse(mineFieldString)

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
