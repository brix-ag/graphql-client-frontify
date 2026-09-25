package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyCustomPermission extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyCustomPermission() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyCustomPermission"));
  }
  /**
   * **BETA** Subject representing the specific user or group granted with the permission.
   */
  public On_CustomMetadataPropertyCustomPermission subject(CustomMetadataPropertyCustomPermission_subject callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Permission level granted to the subject.
   */
  public On_CustomMetadataPropertyCustomPermission permissionLevel() {
    _add_field("permissionLevel");
    return this;
  }
}
