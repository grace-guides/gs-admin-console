package grace.guides

import spock.lang.Specification

import grails.testing.gorm.DomainUnitTest

class PostSpec extends Specification implements DomainUnitTest<Post> {

    def setup() {
    }

    def cleanup() {
    }

    void 'test something'() {
        expect: 'fix me'
        true == false
    }

}
