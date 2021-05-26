package com.murphyl.autumn.core.support;

import com.murphyl.autumn.core.annotation.Value;

/**
 * 元信息
 *
 * @date: 2021/5/26 14:21
 * @author: murph
 */
public interface MetaDetails {


    /**
     * Return the unique id of this application context.
     *
     * @return
     */
    @Value("vm.unique()")
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
    @Value("vm.timestamp()")
    long getStartupDate();

}
