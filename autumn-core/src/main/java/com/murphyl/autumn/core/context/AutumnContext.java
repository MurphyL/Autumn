package com.murphyl.autumn.core.context;

/**
 * 运行时 - 上下文
 *
 * @date: 2021/5/13 11:20
 * @author: murph
 */
public interface AutumnContext {


    /**
     * Return the unique id of this application context.
     *
     * @return
     */
    String getId();

    /**
     * Return a name for the deployed application that this context belongs to.
     *
     * @return
     */
    String getApplicationName();

    /**
     * Return a friendly name for this context.
     *
     * @return
     */
    String getDisplayName();

    /**
     * Return the timestamp when this context was first loaded.
     *
     * @return
     */
    long getStartupDate();

}
