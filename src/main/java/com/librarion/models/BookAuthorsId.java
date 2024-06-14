package com.librarion.models;

import java.io.Serializable;
import java.util.Objects;

public class BookAuthorsId implements Serializable  {
    private int book_id;
    private int author_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookAuthorsId that = (BookAuthorsId) o;
        return book_id == that.book_id && author_id == that.author_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(book_id, author_id);
    }
}
