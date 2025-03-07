package ch.brix.gql.client.frontify.builders;

public class On_AssetUserPermissions extends ch.brix.gql.client.TypeBuilder {
  public On_AssetUserPermissions() {
    super(new ch.brix.gql.client.On("AssetUserPermissions"));
  }
  /**
   * Check if current user has `Asset` editing permissions for a specific `Asset`.
   */
  public On_AssetUserPermissions canEdit() {
    _add_field("canEdit");
    return this;
  }
  /**
   * Check if current user has `Asset` deleting permissions for a specific `Asset`.
   */
  public On_AssetUserPermissions canDelete() {
    _add_field("canDelete");
    return this;
  }
  /**
   * Check if current user has `Asset` download permissions for a specific `Asset`.
   */
  public On_AssetUserPermissions canDownload() {
    _add_field("canDownload");
    return this;
  }
  /**
   * Check if current user has `Comment` creation permissions for a specific `Asset`.
   */
  public On_AssetUserPermissions canComment() {
    _add_field("canComment");
    return this;
  }
}
