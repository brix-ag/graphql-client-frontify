package ch.brix.gql.client.frontify.input_objects;

public class CustomMetadataPropertyPermissionInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Subject representing one specific user, a user group, or a role granted with the permission<br>                e.g.: "user:123", "group:88", "admin", "editor", "internal", "everyone".
   */
  public CustomMetadataPropertyPermissionInput subject(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("subject", v);
    return this;
  }
  /**
   * **BETA** Permission level granted to the subject.
   */
  public CustomMetadataPropertyPermissionInput permissionLevel(ch.brix.gql.client.frontify.enums.CustomMetadataPropertyPermissionLevel v) {
    values.put("permissionLevel", v);
    return this;
  }
}
