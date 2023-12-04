package ch.brix.gql.client.frontify.builders;

public class On_WorkspaceRootFolder extends ch.brix.gql.client.TypeBuilder {
  public On_WorkspaceRootFolder() {
    super(new ch.brix.gql.client.On("WorkspaceRootFolder"));
  }
  /**
   * **DEPRECATED** The `SubFolderItems` of the current `Library`/`Workspace`. This field will be removed. Use `folders` instead. | Date: 2024-07-01T00:00:00.000+00:00
   * This field will be removed. Use `folders` instead. | Date: 2024-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_WorkspaceRootFolder subFolders(WorkspaceRootFolder_subFolders callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `FolderItems` of the current `Library`/`Workspace`.
   */
  public On_WorkspaceRootFolder folders(WorkspaceRootFolder_folders callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library`/`Workspace`'s `AssetItems` list.
   */
  public On_WorkspaceRootFolder assets(WorkspaceRootFolder_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
