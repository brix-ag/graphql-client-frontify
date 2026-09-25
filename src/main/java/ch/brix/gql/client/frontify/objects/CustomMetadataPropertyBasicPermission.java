package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataPropertyBasicPermission {
  /**
   * **BETA** Subject granted with the permission.
   */
  @com.google.gson.annotations.SerializedName("subject")
  private ch.brix.gql.client.frontify.enums.CustomMetadataPropertyBasicPermissionSubject subject;
  /**
   * **BETA** Permission level granted to the subject.
   */
  @com.google.gson.annotations.SerializedName("permissionLevel")
  private ch.brix.gql.client.frontify.enums.CustomMetadataPropertyPermissionLevel permissionLevel;
}
