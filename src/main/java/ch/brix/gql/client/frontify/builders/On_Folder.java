package ch.brix.gql.client.frontify.builders;

public class On_Folder extends ch.brix.gql.client.TypeBuilder {
  public On_Folder() {
    super(new ch.brix.gql.client.On("Folder"));
  }
  /**
   * `Folder` Id.
   */
  public On_Folder id() {
    _add_field("id");
    return this;
  }
  /**
   * `Folder` name.
   */
  public On_Folder name() {
    _add_field("name");
    return this;
  }
  /**
   * The `User` who created the `Folder`.
   */
  public On_Folder creator(Folder_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Folder` creation.
   */
  public On_Folder createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * The `User` who last modified the `Folder`.
   */
  public On_Folder modifier(Folder_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the last `Folder` modification.
   */
  public On_Folder modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * A list of `Breadcrumb` items representing the parent folders structure for the current `SubFolder`.
   */
  public On_Folder breadcrumbs(Folder_breadcrumbs callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** The `SubFolderItems` of the current `Library`/`Workspace`/`SubFolder`. This field will be removed. Use `folders` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `folders` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_Folder subFolders(Folder_subFolders callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `FolderItems` of the current `Library`/`Workspace`/`Folder`.
   */
  public On_Folder folders(Folder_folders callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `AssetItems` in the current `Library`/`Workspace`/`Folder`.
   */
  public On_Folder assets(Folder_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
