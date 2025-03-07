package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AddAssetMetadataFieldValue {
  /**
   * `MetadataValue` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `User` who created the `MetadataValue`.
   */
  @com.google.gson.annotations.SerializedName("creator")
  private ch.brix.gql.client.frontify.interfaces.User creator;
  /**
   * `DateTime` of the `MetadataValue` creation.
   */
  @com.google.gson.annotations.SerializedName("createdAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar createdAt;
  /**
   * `User` who last modified the `MetadataValue`.
   */
  @com.google.gson.annotations.SerializedName("modifier")
  private ch.brix.gql.client.frontify.interfaces.User modifier;
  /**
   * `DateTime` of the `MetadataValue` last modification.
   */
  @com.google.gson.annotations.SerializedName("modifiedAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar modifiedAt;
  /**
   * `MetadataField` related to the `MetadataValue`.
   */
  @com.google.gson.annotations.SerializedName("metadataField")
  private ch.brix.gql.client.frontify.objects.MetadataField metadataField;
  /**
   * `MetadataValue` value.
   */
  @com.google.gson.annotations.SerializedName("value")
  private ch.brix.gql.client.frontify.scalars.StringScalar value;
}
