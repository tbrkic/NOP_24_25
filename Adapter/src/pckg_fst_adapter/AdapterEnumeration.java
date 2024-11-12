package pckg_fst_adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class AdapterEnumeration < E > implements Iterator {
	Enumeration<E> enumeration;
	
	public AdapterEnumeration(Enumeration enumeration){
		this.enumeration=enumeration;
	}
	/**
	 * Returns {@code true} if the iteration has more elements.
	 * (In other words, returns {@code true} if {@link #next} would
	 * return an element rather than throwing an exception.)
	 *
	 * @return {@code true} if the iteration has more elements
	 */
	@Override
	public boolean hasNext ( ) {
		return false;
	}
	
	/**
	 * Returns the next element in the iteration.
	 *
	 * @return the next element in the iteration
	 *
	 * @throws NoSuchElementException
	 * 		if the iteration has no more elements
	 */
	@Override
	public E next ( ) {
		return null;
	}
	
	/**
	 * Removes from the underlying collection the last element returned
	 * by this iterator (optional operation).  This method can be called
	 * only once per call to {@link #next}.
	 * <p>
	 * The behavior of an iterator is unspecified if the underlying collection
	 * is modified while the iteration is in progress in any way other than by
	 * calling this method, unless an overriding class has specified a
	 * concurrent modification policy.
	 * <p>
	 * The behavior of an iterator is unspecified if this method is called
	 * after a call to the {@link #forEachRemaining forEachRemaining} method.
	 *
	 * @throws UnsupportedOperationException
	 * 		if the {@code remove}
	 * 		operation is not supported by this iterator
	 * @throws IllegalStateException
	 * 		if the {@code next} method has not
	 * 		yet been called, or the {@code remove} method has already
	 * 		been called after the last call to the {@code next}
	 * 		method
	 * @implSpec The default implementation throws an instance of
	 *                {@link UnsupportedOperationException} and performs no other action.
	 */
	@Override
	public void remove ( ) {
		System.out.println ("Does not support removal of elements - can be resolved with API" );
	}
}
