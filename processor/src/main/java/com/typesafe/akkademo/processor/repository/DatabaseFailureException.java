/**
 *  Copyright (C) 2011-2012 Typesafe <http://typesafe.com/>
 */
package com.typesafe.akkademo.processor.repository;

class DatabaseFailureException extends RuntimeException {
    DatabaseFailureException(String s) {
        super(s);
    }
}
