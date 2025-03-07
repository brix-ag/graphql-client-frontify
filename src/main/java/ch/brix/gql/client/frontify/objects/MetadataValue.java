package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class MetadataValue {
  /**
   * **DEPRECATED** `MetadataValue` Id. This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **DEPRECATED** `User` who created the `MetadataValue`. This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("creator")
  private ch.brix.gql.client.frontify.interfaces.User creator;
  /**
   * **DEPRECATED** `DateTime` of the `MetadataValue` creation. This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("createdAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar createdAt;
  /**
   * **DEPRECATED** `User` who last modified the `MetadataValue`. This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("modifier")
  private ch.brix.gql.client.frontify.interfaces.User modifier;
  /**
   * **DEPRECATED** `DateTime` of the `MetadataValue`'s last modification. This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("modifiedAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar modifiedAt;
  /**
   * **DEPRECATED** `MetadataField` associated to `MetadataValue`. This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("metadataField")
  private ch.brix.gql.client.frontify.objects.MetadataField metadataField;
  /**
   * **DEPRECATED** `MetadataValue`'s value. This field will be removed. Use `CustomMetadataValueType.value` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataValueType.value` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("value")
  private ch.brix.gql.client.frontify.scalars.StringScalar value;
}
