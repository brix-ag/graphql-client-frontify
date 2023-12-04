package ch.brix.gql.client.frontify.builders;

public class On_CollectionUserPermissions extends ch.brix.gql.client.TypeBuilder {
  public On_CollectionUserPermissions() {
    super(new ch.brix.gql.client.On("CollectionUserPermissions"));
  }
  /**
   * Check if the current user can add `Assets` in this `Collection`.
   */
  public On_CollectionUserPermissions canAddAssets() {
    _add_field("canAddAssets");
    return this;
  }
  /**
   * Check if the current user can remove `Assets` from this `Collection`.
   */
  public On_CollectionUserPermissions canRemoveAssets() {
    _add_field("canRemoveAssets");
    return this;
  }
}
