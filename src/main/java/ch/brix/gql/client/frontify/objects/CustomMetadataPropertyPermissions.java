package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataPropertyPermissions {
  /**
   * **BETA** List of basic permissions defined for the custom metadata property.
   */
  @com.google.gson.annotations.SerializedName("basic")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CustomMetadataPropertyBasicPermission.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CustomMetadataPropertyBasicPermission> basic;
  /**
   * **BETA** List of custom permissions defined for the custom metadata property.
   */
  @com.google.gson.annotations.SerializedName("custom")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CustomMetadataPropertyCustomPermission.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CustomMetadataPropertyCustomPermission> custom;
}
