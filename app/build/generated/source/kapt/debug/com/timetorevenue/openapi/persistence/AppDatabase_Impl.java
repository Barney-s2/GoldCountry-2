package com.timetorevenue.openapi.persistence;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile AuthTokenDao _authTokenDao;

  private volatile AccountPropertiesDao _accountPropertiesDao;

  private volatile BlogPostDao _blogPostDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `auth_token` (`account_pk` INTEGER, `token` TEXT, PRIMARY KEY(`account_pk`), FOREIGN KEY(`account_pk`) REFERENCES `account_properties`(`pk`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `account_properties` (`pk` INTEGER NOT NULL, `email` TEXT NOT NULL, `username` TEXT NOT NULL, PRIMARY KEY(`pk`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `blog_post` (`pK` INTEGER NOT NULL, `title` TEXT NOT NULL, `slug` TEXT NOT NULL, `body` TEXT NOT NULL, `image` TEXT NOT NULL, `updated_at` TEXT NOT NULL, `created_at` TEXT NOT NULL, `username` TEXT NOT NULL, PRIMARY KEY(`pK`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '444b97205fd3c4c04388492642a0db3d')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `auth_token`");
        _db.execSQL("DROP TABLE IF EXISTS `account_properties`");
        _db.execSQL("DROP TABLE IF EXISTS `blog_post`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsAuthToken = new HashMap<String, TableInfo.Column>(2);
        _columnsAuthToken.put("account_pk", new TableInfo.Column("account_pk", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuthToken.put("token", new TableInfo.Column("token", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAuthToken = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysAuthToken.add(new TableInfo.ForeignKey("account_properties", "CASCADE", "NO ACTION",Arrays.asList("account_pk"), Arrays.asList("pk")));
        final HashSet<TableInfo.Index> _indicesAuthToken = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAuthToken = new TableInfo("auth_token", _columnsAuthToken, _foreignKeysAuthToken, _indicesAuthToken);
        final TableInfo _existingAuthToken = TableInfo.read(_db, "auth_token");
        if (! _infoAuthToken.equals(_existingAuthToken)) {
          return new RoomOpenHelper.ValidationResult(false, "auth_token(com.timetorevenue.openapi.models.AuthToken).\n"
                  + " Expected:\n" + _infoAuthToken + "\n"
                  + " Found:\n" + _existingAuthToken);
        }
        final HashMap<String, TableInfo.Column> _columnsAccountProperties = new HashMap<String, TableInfo.Column>(3);
        _columnsAccountProperties.put("pk", new TableInfo.Column("pk", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountProperties.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountProperties.put("username", new TableInfo.Column("username", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAccountProperties = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAccountProperties = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAccountProperties = new TableInfo("account_properties", _columnsAccountProperties, _foreignKeysAccountProperties, _indicesAccountProperties);
        final TableInfo _existingAccountProperties = TableInfo.read(_db, "account_properties");
        if (! _infoAccountProperties.equals(_existingAccountProperties)) {
          return new RoomOpenHelper.ValidationResult(false, "account_properties(com.timetorevenue.openapi.models.AccountProperties).\n"
                  + " Expected:\n" + _infoAccountProperties + "\n"
                  + " Found:\n" + _existingAccountProperties);
        }
        final HashMap<String, TableInfo.Column> _columnsBlogPost = new HashMap<String, TableInfo.Column>(8);
        _columnsBlogPost.put("pK", new TableInfo.Column("pK", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBlogPost.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBlogPost.put("slug", new TableInfo.Column("slug", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBlogPost.put("body", new TableInfo.Column("body", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBlogPost.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBlogPost.put("updated_at", new TableInfo.Column("updated_at", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBlogPost.put("created_at", new TableInfo.Column("created_at", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBlogPost.put("username", new TableInfo.Column("username", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBlogPost = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBlogPost = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBlogPost = new TableInfo("blog_post", _columnsBlogPost, _foreignKeysBlogPost, _indicesBlogPost);
        final TableInfo _existingBlogPost = TableInfo.read(_db, "blog_post");
        if (! _infoBlogPost.equals(_existingBlogPost)) {
          return new RoomOpenHelper.ValidationResult(false, "blog_post(com.timetorevenue.openapi.models.BlogPost).\n"
                  + " Expected:\n" + _infoBlogPost + "\n"
                  + " Found:\n" + _existingBlogPost);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "444b97205fd3c4c04388492642a0db3d", "14df8c02c459fb409f53d6ea8924df88");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "auth_token","account_properties","blog_post");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `auth_token`");
      _db.execSQL("DELETE FROM `account_properties`");
      _db.execSQL("DELETE FROM `blog_post`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public AuthTokenDao getAuthTokenDao() {
    if (_authTokenDao != null) {
      return _authTokenDao;
    } else {
      synchronized(this) {
        if(_authTokenDao == null) {
          _authTokenDao = new AuthTokenDao_Impl(this);
        }
        return _authTokenDao;
      }
    }
  }

  @Override
  public AccountPropertiesDao getAccountPropertiesDao() {
    if (_accountPropertiesDao != null) {
      return _accountPropertiesDao;
    } else {
      synchronized(this) {
        if(_accountPropertiesDao == null) {
          _accountPropertiesDao = new AccountPropertiesDao_Impl(this);
        }
        return _accountPropertiesDao;
      }
    }
  }

  @Override
  public BlogPostDao getBlogPostDao() {
    if (_blogPostDao != null) {
      return _blogPostDao;
    } else {
      synchronized(this) {
        if(_blogPostDao == null) {
          _blogPostDao = new BlogPostDao_Impl(this);
        }
        return _blogPostDao;
      }
    }
  }
}