/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bsc.functional;

/**
 * function
 * 
 * @param <R> return
 * @param <P> argument
 */
public interface F<R, P> {

    R f(P p);
}