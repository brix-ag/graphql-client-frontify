package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataPropertyCustomPermission {
  /**
   * **BETA** Subject representing the specific user or group granted with the permission.
   */
  @com.google.gson.annotations.SerializedName("subject")
  private ch.brix.gql.client.frontify.unions.AccountCollaborator subject;
  /**
   * **BETA** Permission level granted to the subject.
   */
  @com.google.gson.annotations.SerializedName("permissionLevel")
  private ch.brix.gql.client.frontify.enums.CustomMetadataPropertyPermissionLevel permissionLevel;
}
