//An interface can have another interface which is known as a nested interface. We will learn it in detail in the nested classes chapter. For example:
package Keywords;
interface printable {
	void print();

	interface MessagePrintable {
		void msg();
	}
}