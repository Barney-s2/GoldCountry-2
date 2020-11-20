package com.timetorevenue.openapi.persistence;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.timetorevenue.openapi.models.BlogPost;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BlogPostDao_Impl implements BlogPostDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BlogPost> __insertionAdapterOfBlogPost;

  private final EntityInsertionAdapter<BlogPost> __insertionAdapterOfBlogPost_1;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllBlogPosts;

  private final SharedSQLiteStatement __preparedStmtOfUpdateBlogPost;

  public BlogPostDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBlogPost = new EntityInsertionAdapter<BlogPost>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `blog_post` (`pK`,`title`,`slug`,`body`,`image`,`updated_at`,`created_at`,`username`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BlogPost value) {
        stmt.bindLong(1, value.getPk());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getSlug() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSlug());
        }
        if (value.getBody() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBody());
        }
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage());
        }
        if (value.getUpdated_at() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUpdated_at());
        }
        if (value.getCreated_at() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCreated_at());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUsername());
        }
      }
    };
    this.__insertionAdapterOfBlogPost_1 = new EntityInsertionAdapter<BlogPost>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `blog_post` (`pK`,`title`,`slug`,`body`,`image`,`updated_at`,`created_at`,`username`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BlogPost value) {
        stmt.bindLong(1, value.getPk());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getSlug() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSlug());
        }
        if (value.getBody() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBody());
        }
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage());
        }
        if (value.getUpdated_at() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUpdated_at());
        }
        if (value.getCreated_at() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCreated_at());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUsername());
        }
      }
    };
    this.__preparedStmtOfDeleteAllBlogPosts = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM blog_post";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateBlogPost = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE blog_post \n"
                + "        SET \n"
                + "        title = ?,\n"
                + "        body = ?,\n"
                + "        image = ?,\n"
                + "        updated_at = ?\n"
                + "        WHERE pk = ?\n"
                + "        ";
        return _query;
      }
    };
  }

  @Override
  public Object insertBlogPost(final BlogPost blogPost, final Continuation<? super Long> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfBlogPost.insertAndReturnId(blogPost);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertBlogPosts(final List<BlogPost> blogPosts,
      final Continuation<? super long[]> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<long[]>() {
      @Override
      public long[] call() throws Exception {
        __db.beginTransaction();
        try {
          long[] _result = __insertionAdapterOfBlogPost_1.insertAndReturnIdsArray(blogPosts);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAllBlogPosts(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllBlogPosts.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllBlogPosts.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object updateBlogPost(final String pk, final String title, final String body,
      final String image, final String updated_at, final Continuation<? super Integer> p5) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateBlogPost.acquire();
        int _argIndex = 1;
        if (title == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, title);
        }
        _argIndex = 2;
        if (body == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, body);
        }
        _argIndex = 3;
        if (image == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, image);
        }
        _argIndex = 4;
        if (updated_at == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, updated_at);
        }
        _argIndex = 5;
        if (pk == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, pk);
        }
        __db.beginTransaction();
        try {
          final java.lang.Integer _result = _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateBlogPost.release(_stmt);
        }
      }
    }, p5);
  }

  @Override
  public Object searchBlogPostById(final String pk, final Continuation<? super BlogPost> p1) {
    final String _sql = "SELECT * FROM blog_post Where pk = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (pk == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, pk);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<BlogPost>() {
      @Override
      public BlogPost call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPk = CursorUtil.getColumnIndexOrThrow(_cursor, "pK");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSlug = CursorUtil.getColumnIndexOrThrow(_cursor, "slug");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final BlogPost _result;
          if(_cursor.moveToFirst()) {
            final int _tmpPk;
            _tmpPk = _cursor.getInt(_cursorIndexOfPk);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpSlug;
            _tmpSlug = _cursor.getString(_cursorIndexOfSlug);
            final String _tmpBody;
            _tmpBody = _cursor.getString(_cursorIndexOfBody);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            final String _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getString(_cursorIndexOfUpdatedAt);
            final String _tmpCreated_at;
            _tmpCreated_at = _cursor.getString(_cursorIndexOfCreatedAt);
            final String _tmpUsername;
            _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            _result = new BlogPost(_tmpPk,_tmpTitle,_tmpSlug,_tmpBody,_tmpImage,_tmpUpdated_at,_tmpCreated_at,_tmpUsername);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object getAllBlogPosts(final Continuation<? super List<BlogPost>> p0) {
    final String _sql = "SELECT * FROM blog_post";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<BlogPost>>() {
      @Override
      public List<BlogPost> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPk = CursorUtil.getColumnIndexOrThrow(_cursor, "pK");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSlug = CursorUtil.getColumnIndexOrThrow(_cursor, "slug");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final List<BlogPost> _result = new ArrayList<BlogPost>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final BlogPost _item;
            final int _tmpPk;
            _tmpPk = _cursor.getInt(_cursorIndexOfPk);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpSlug;
            _tmpSlug = _cursor.getString(_cursorIndexOfSlug);
            final String _tmpBody;
            _tmpBody = _cursor.getString(_cursorIndexOfBody);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            final String _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getString(_cursorIndexOfUpdatedAt);
            final String _tmpCreated_at;
            _tmpCreated_at = _cursor.getString(_cursorIndexOfCreatedAt);
            final String _tmpUsername;
            _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            _item = new BlogPost(_tmpPk,_tmpTitle,_tmpSlug,_tmpBody,_tmpImage,_tmpUpdated_at,_tmpCreated_at,_tmpUsername);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object searchBlogPosts(final Continuation<? super List<BlogPost>> p0) {
    final String _sql = "SELECT * FROM blog_post";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<BlogPost>>() {
      @Override
      public List<BlogPost> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPk = CursorUtil.getColumnIndexOrThrow(_cursor, "pK");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSlug = CursorUtil.getColumnIndexOrThrow(_cursor, "slug");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final List<BlogPost> _result = new ArrayList<BlogPost>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final BlogPost _item;
            final int _tmpPk;
            _tmpPk = _cursor.getInt(_cursorIndexOfPk);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpSlug;
            _tmpSlug = _cursor.getString(_cursorIndexOfSlug);
            final String _tmpBody;
            _tmpBody = _cursor.getString(_cursorIndexOfBody);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            final String _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getString(_cursorIndexOfUpdatedAt);
            final String _tmpCreated_at;
            _tmpCreated_at = _cursor.getString(_cursorIndexOfCreatedAt);
            final String _tmpUsername;
            _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            _item = new BlogPost(_tmpPk,_tmpTitle,_tmpSlug,_tmpBody,_tmpImage,_tmpUpdated_at,_tmpCreated_at,_tmpUsername);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object searchBlogPostsOrderByDateDESC(final String query, final int page,
      final int pageSize, final Continuation<? super List<BlogPost>> p3) {
    final String _sql = "\n"
            + "        SELECT * FROM blog_post \n"
            + "        WHERE title LIKE '%' || ? || '%' \n"
            + "        OR body LIKE '%' || ? || '%' \n"
            + "        ORDER BY updated_at DESC LIMIT (? * ?)\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 3;
    _statement.bindLong(_argIndex, page);
    _argIndex = 4;
    _statement.bindLong(_argIndex, pageSize);
    return CoroutinesRoom.execute(__db, false, new Callable<List<BlogPost>>() {
      @Override
      public List<BlogPost> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPk = CursorUtil.getColumnIndexOrThrow(_cursor, "pK");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSlug = CursorUtil.getColumnIndexOrThrow(_cursor, "slug");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final List<BlogPost> _result = new ArrayList<BlogPost>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final BlogPost _item;
            final int _tmpPk;
            _tmpPk = _cursor.getInt(_cursorIndexOfPk);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpSlug;
            _tmpSlug = _cursor.getString(_cursorIndexOfSlug);
            final String _tmpBody;
            _tmpBody = _cursor.getString(_cursorIndexOfBody);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            final String _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getString(_cursorIndexOfUpdatedAt);
            final String _tmpCreated_at;
            _tmpCreated_at = _cursor.getString(_cursorIndexOfCreatedAt);
            final String _tmpUsername;
            _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            _item = new BlogPost(_tmpPk,_tmpTitle,_tmpSlug,_tmpBody,_tmpImage,_tmpUpdated_at,_tmpCreated_at,_tmpUsername);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p3);
  }

  @Override
  public Object searchBlogPostsOrderByDateASC(final String query, final int page,
      final int pageSize, final Continuation<? super List<BlogPost>> p3) {
    final String _sql = "\n"
            + "        SELECT * FROM blog_post \n"
            + "        WHERE title LIKE '%' || ? || '%' \n"
            + "        OR body LIKE '%' || ? || '%' \n"
            + "        ORDER BY updated_at ASC LIMIT (? * ?)\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 3;
    _statement.bindLong(_argIndex, page);
    _argIndex = 4;
    _statement.bindLong(_argIndex, pageSize);
    return CoroutinesRoom.execute(__db, false, new Callable<List<BlogPost>>() {
      @Override
      public List<BlogPost> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPk = CursorUtil.getColumnIndexOrThrow(_cursor, "pK");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSlug = CursorUtil.getColumnIndexOrThrow(_cursor, "slug");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final List<BlogPost> _result = new ArrayList<BlogPost>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final BlogPost _item;
            final int _tmpPk;
            _tmpPk = _cursor.getInt(_cursorIndexOfPk);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpSlug;
            _tmpSlug = _cursor.getString(_cursorIndexOfSlug);
            final String _tmpBody;
            _tmpBody = _cursor.getString(_cursorIndexOfBody);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            final String _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getString(_cursorIndexOfUpdatedAt);
            final String _tmpCreated_at;
            _tmpCreated_at = _cursor.getString(_cursorIndexOfCreatedAt);
            final String _tmpUsername;
            _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            _item = new BlogPost(_tmpPk,_tmpTitle,_tmpSlug,_tmpBody,_tmpImage,_tmpUpdated_at,_tmpCreated_at,_tmpUsername);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p3);
  }

  @Override
  public Object searchBlogPostsOrderByTitleDESC(final String query, final int page,
      final int pageSize, final Continuation<? super List<BlogPost>> p3) {
    final String _sql = "\n"
            + "        SELECT * FROM blog_post \n"
            + "        WHERE title LIKE '%' || ? || '%' \n"
            + "        OR body LIKE '%' || ? || '%' \n"
            + "        ORDER BY title DESC LIMIT (? * ?)\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 3;
    _statement.bindLong(_argIndex, page);
    _argIndex = 4;
    _statement.bindLong(_argIndex, pageSize);
    return CoroutinesRoom.execute(__db, false, new Callable<List<BlogPost>>() {
      @Override
      public List<BlogPost> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPk = CursorUtil.getColumnIndexOrThrow(_cursor, "pK");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSlug = CursorUtil.getColumnIndexOrThrow(_cursor, "slug");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final List<BlogPost> _result = new ArrayList<BlogPost>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final BlogPost _item;
            final int _tmpPk;
            _tmpPk = _cursor.getInt(_cursorIndexOfPk);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpSlug;
            _tmpSlug = _cursor.getString(_cursorIndexOfSlug);
            final String _tmpBody;
            _tmpBody = _cursor.getString(_cursorIndexOfBody);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            final String _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getString(_cursorIndexOfUpdatedAt);
            final String _tmpCreated_at;
            _tmpCreated_at = _cursor.getString(_cursorIndexOfCreatedAt);
            final String _tmpUsername;
            _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            _item = new BlogPost(_tmpPk,_tmpTitle,_tmpSlug,_tmpBody,_tmpImage,_tmpUpdated_at,_tmpCreated_at,_tmpUsername);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p3);
  }

  @Override
  public Object searchBlogPostsOrderByTitleASC(final String query, final int page,
      final int pageSize, final Continuation<? super List<BlogPost>> p3) {
    final String _sql = "\n"
            + "        SELECT * FROM blog_post \n"
            + "        WHERE title LIKE '%' || ? || '%' \n"
            + "        OR body LIKE '%' || ? || '%' \n"
            + "        ORDER BY title ASC LIMIT (? * ?)\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 3;
    _statement.bindLong(_argIndex, page);
    _argIndex = 4;
    _statement.bindLong(_argIndex, pageSize);
    return CoroutinesRoom.execute(__db, false, new Callable<List<BlogPost>>() {
      @Override
      public List<BlogPost> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPk = CursorUtil.getColumnIndexOrThrow(_cursor, "pK");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSlug = CursorUtil.getColumnIndexOrThrow(_cursor, "slug");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final List<BlogPost> _result = new ArrayList<BlogPost>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final BlogPost _item;
            final int _tmpPk;
            _tmpPk = _cursor.getInt(_cursorIndexOfPk);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpSlug;
            _tmpSlug = _cursor.getString(_cursorIndexOfSlug);
            final String _tmpBody;
            _tmpBody = _cursor.getString(_cursorIndexOfBody);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            final String _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getString(_cursorIndexOfUpdatedAt);
            final String _tmpCreated_at;
            _tmpCreated_at = _cursor.getString(_cursorIndexOfCreatedAt);
            final String _tmpUsername;
            _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            _item = new BlogPost(_tmpPk,_tmpTitle,_tmpSlug,_tmpBody,_tmpImage,_tmpUpdated_at,_tmpCreated_at,_tmpUsername);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p3);
  }

  @Override
  public Object getNumBlogPost(final Continuation<? super Integer> p0) {
    final String _sql = "SELECT COUNT(*) FROM blog_post";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object deleteBlogPosts(final List<String> pks, final Continuation<? super Integer> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        StringBuilder _stringBuilder = StringUtil.newStringBuilder();
        _stringBuilder.append("DELETE FROM blog_post WHERE pk IN (");
        final int _inputSize = pks.size();
        StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
        _stringBuilder.append(")");
        final String _sql = _stringBuilder.toString();
        final SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
        int _argIndex = 1;
        for (String _item : pks) {
          if (_item == null) {
            _stmt.bindNull(_argIndex);
          } else {
            _stmt.bindString(_argIndex, _item);
          }
          _argIndex ++;
        }
        __db.beginTransaction();
        try {
          final java.lang.Integer _result = _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteBlogPost(final BlogPost primaryKey, final Continuation<? super Integer> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final String _sql = "DELETE FROM blog_post WHERE pk = ?";
        final SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
        int _argIndex = 1;
        __db.beginTransaction();
        try {
          final java.lang.Integer _result = _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }
}
