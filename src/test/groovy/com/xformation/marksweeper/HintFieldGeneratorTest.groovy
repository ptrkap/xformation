package com.xformation.marksweeper

import spock.lang.Specification

/**
 * Created by PK on 11/5/2015.
 */
class HintFieldGeneratorTest extends Specification {

    def hintFieldGenerator = new HintFieldGenerator();

    def "should generate hint field string"() {
        given:
        char[][] mineField = [
                ['*', '.', '.', '.'],
                ['.', '.', '*', '.'],
                ['.', '.', '.', '.']
        ]

        when:
        def hintFieldsString = hintFieldGenerator.generate(mineField)

        then:
        hintFieldsString == "*211\n12*1\n0111"
    }

    def "should throw IllegalStateException because of not initialized mine field"() {
        when:
        hintFieldGenerator.generate(null)

        then:
        def e = thrown(IllegalStateException)
        e.message == "mine field is not initialized"
    }
}
