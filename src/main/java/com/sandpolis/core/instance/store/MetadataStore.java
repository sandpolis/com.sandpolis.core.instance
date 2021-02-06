//============================================================================//
//                                                                            //
//                         Copyright © 2015 Sandpolis                         //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPL    //
//  as published by the Mozilla Foundation.                                   //
//                                                                            //
//============================================================================//
package com.sandpolis.core.instance.store;

/**
 * A store that tracks metadata such as the total number of times the store has
 * been initialized, usage statistics, and any other domain-specific information
 * that may be useful.
 *
 * @param <E> The metadata type
 */
public interface MetadataStore<E extends StoreMetadata> {

	/**
	 * Get a handle on the store's metadata which is updated in real-time.
	 *
	 * @return The metadata object
	 */
	public E getMetadata();
}
