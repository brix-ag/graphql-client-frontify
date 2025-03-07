package ch.brix.gql.client.frontify.builders;

public class On_SubFolder extends ch.brix.gql.client.TypeBuilder {
  public On_SubFolder() {
    super(new ch.brix.gql.client.On("SubFolder"));
  }
  /**
   * `SubFolder` Id.
   */
  public On_SubFolder id() {
    _add_field("id");
    return this;
  }
  /**
   * `SubFolder` name.
   */
  public On_SubFolder name() {
    _add_field("name");
    return this;
  }
  /**
   * The `User` who created the `SubFolder`.
   */
  public On_SubFolder creator(SubFolder_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `SubFolder` creation.
   */
  public On_SubFolder createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * The `User` who last modified the `SubFolder`.
   */
  public On_SubFolder modifier(SubFolder_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the last `SubFolder` modification.
   */
  public On_SubFolder modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * A list of `Breadcrumb` items representing the parent folders structure for the current `SubFolder`.
   */
  public On_SubFolder breadcrumbs(SubFolder_breadcrumbs callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** The `SubFolderItems` of the current `SubFolder`. This field will be removed. Use `folders` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `folders` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_SubFolder subFolders(SubFolder_subFolders callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `FolderItems` of the current `Folder`.
   */
  public On_SubFolder folders(SubFolder_folders callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `AssetItems` in the current `SubFolder`.
   */
  public On_SubFolder assets(SubFolder_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
