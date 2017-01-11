/*
  Cheat Sheet:
      comment out with line comment
          command-/
      comment out with block comment
          shift-ctrl-/
      select current line
          option-s
      select increasing/decreasing blocks of code
           option-up
           option-down
      delete current line
           cmd-backspace
      reformat code
          option-command-l
      lookup parameter list
           command-p
      go to previous edit location
          shift-command-backspace
      paste from last N clipboard entries
          shift-command-v
      jump to member of current file
          command-f12
      show recently edited files
          shift-command-e
      select to end of next block
          shift-alt-command-]
*/


import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.*;
import java.util.stream.*;

public class Kata04_navigation {
    //-----------------------------------------------------------------------------------
    // Uncomment this and lookup the parameter list
    //-----------------------------------------------------------------------------------

/*
    public void longMethod(String name, String address, int age, int epoch) {
    }

    public void kata1() {
        // this is the place to lookup parameters
        longMethod();

    }
*/

    //      navigation help:
    //          next word alt-right, alt-left


    //-----------------------------------------------------------------------------------
    // Go to last previous edit location
    //-----------------------------------------------------------------------------------


    //-----------------------------------------------------------------------------------
    // Jump to members in the current file (navigation)
    //-----------------------------------------------------------------------------------

    //-----------------------------------------------------------------------------------
    // Show recently edited files
    //-----------------------------------------------------------------------------------


    //-----------------------------------------------------------------------------------
    // This stuff is here just so the "jump to member" command has something to find
    //-----------------------------------------------------------------------------------
    public void foo() {

    }
    public static final int bar = 3;

    public static final class MyStream implements Stream {

        @Override
        public Stream filter(Predicate predicate) {
            return null;
        }

        @Override
        public IntStream mapToInt(ToIntFunction mapper) {
            return null;
        }

        @Override
        public LongStream mapToLong(ToLongFunction mapper) {
            return null;
        }

        @Override
        public DoubleStream mapToDouble(ToDoubleFunction mapper) {
            return null;
        }

        @Override
        public IntStream flatMapToInt(Function mapper) {
            return null;
        }

        @Override
        public LongStream flatMapToLong(Function mapper) {
            return null;
        }

        @Override
        public DoubleStream flatMapToDouble(Function mapper) {
            return null;
        }

        @Override
        public Stream distinct() {
            return null;
        }

        @Override
        public Stream sorted() {
            return null;
        }

        @Override
        public Stream sorted(Comparator comparator) {
            return null;
        }

        @Override
        public Stream peek(Consumer action) {
            return null;
        }

        @Override
        public Stream limit(long maxSize) {
            return null;
        }

        @Override
        public Stream skip(long n) {
            return null;
        }

        @Override
        public void forEach(Consumer action) {

        }

        @Override
        public void forEachOrdered(Consumer action) {

        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public Object reduce(Object identity, BinaryOperator accumulator) {
            return null;
        }

        @Override
        public Optional reduce(BinaryOperator accumulator) {
            return null;
        }

        @Override
        public Optional min(Comparator comparator) {
            return null;
        }

        @Override
        public Optional max(Comparator comparator) {
            return null;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public boolean anyMatch(Predicate predicate) {
            return false;
        }

        @Override
        public boolean allMatch(Predicate predicate) {
            return false;
        }

        @Override
        public boolean noneMatch(Predicate predicate) {
            return false;
        }

        @Override
        public Optional findFirst() {
            return null;
        }

        @Override
        public Optional findAny() {
            return null;
        }

        @Override
        public Object collect(Collector collector) {
            return null;
        }

        @Override
        public Object collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner) {
            return null;
        }

        @Override
        public Object reduce(Object identity, BiFunction accumulator, BinaryOperator combiner) {
            return null;
        }

        @Override
        public Object[] toArray(IntFunction generator) {
            return new Object[0];
        }

        @Override
        public Stream flatMap(Function mapper) {
            return null;
        }

        @Override
        public Stream map(Function mapper) {
            return null;
        }

        @Override
        public Iterator iterator() {
            return null;
        }

        @Override
        public Spliterator spliterator() {
            return null;
        }

        @Override
        public boolean isParallel() {
            return false;
        }

        @Override
        public BaseStream sequential() {
            return null;
        }

        @Override
        public BaseStream parallel() {
            return null;
        }

        @Override
        public BaseStream unordered() {
            return null;
        }

        @Override
        public BaseStream onClose(Runnable closeHandler) {
            return null;
        }

        @Override
        public void close() {

        }
    }
}
