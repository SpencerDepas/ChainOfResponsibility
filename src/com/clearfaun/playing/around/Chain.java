package com.clearfaun.playing.around;

/**
 * Created by SpencerDepas on 6/7/16.
 */
public interface Chain {

    public abstract void setNext(Chain nextInChain);
    public abstract void process(Animal diagnosis);

}
