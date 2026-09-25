package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyBasicPermission extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyBasicPermission() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyBasicPermission"));
  }
  /**
   * **BETA** Subject granted with the permission.
   */
  public On_CustomMetadataPropertyBasicPermission subject() {
    _add_field("subject");
    return this;
  }
  /**
   * **BETA** Permission level granted to the subject.
   */
  public On_CustomMetadataPropertyBasicPermission permissionLevel() {
    _add_field("permissionLevel");
    return this;
  }
}
