package ch.brix.gql.client.frontify.builders;

public class On_LibraryRootFolder extends ch.brix.gql.client.TypeBuilder {
  public On_LibraryRootFolder() {
    super(new ch.brix.gql.client.On("LibraryRootFolder"));
  }
  /**
   * **DEPRECATED** The `SubFolderItems` of the current `Library`/`Workspace`. This field will be removed. Use `folders` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `folders` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_LibraryRootFolder subFolders(LibraryRootFolder_subFolders callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `FolderItems` of the current `Library`/`Workspace`.
   */
  public On_LibraryRootFolder folders(LibraryRootFolder_folders callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library`/`Workspace`'s `AssetItems` list.
   */
  public On_LibraryRootFolder assets(LibraryRootFolder_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
