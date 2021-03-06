package org.javastack.bouncer;

public class StickyConfig {
	public static final StickyConfig NULL = new StickyConfig(Type.NULL, 0, 0, 0);
	public final Type type;
	public final int bitmask;
	public final int elements;
	public final int ttlsec;

	public StickyConfig(final Type type, final int bitmask, final int elements, final int ttlsec) {
		this.type = type;
		this.bitmask = bitmask;
		this.elements = elements;
		this.ttlsec = ttlsec;
	}

	public enum Type {
		/**
		 * NULL
		 */
		NULL,
		/**
		 * MEMORY
		 */
		MEM;
	}
}
