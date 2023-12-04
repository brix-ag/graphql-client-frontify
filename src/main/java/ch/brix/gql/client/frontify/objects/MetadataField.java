package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class MetadataField {
  /**
   * **DEPRECATED** `MetadataField` Id. This field will be removed. Use `CustomMetadataProperty.id` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.id` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **DEPRECATED** `User` who created the `MetadataField`. This field will be removed. Use `CustomMetadataProperty.creator` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.creator` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("creator")
  private ch.brix.gql.client.frontify.interfaces.User creator;
  /**
   * **DEPRECATED** `DateTime` of the `MetadataField` creation. This field will be removed. Use `CustomMetadataProperty.createdAt` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.createdAt` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("createdAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar createdAt;
  /**
   * **DEPRECATED** `User` who last modified `MetadataField`. This field will be removed. Use `CustomMetadataProperty.modifier` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.modifier` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("modifier")
  private ch.brix.gql.client.frontify.interfaces.User modifier;
  /**
   * **DEPRECATED** `DateTime` of the `MetadataField`'s last modification. This field will be removed. Use `CustomMetadataProperty.modifiedAt` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.modifiedAt` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("modifiedAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar modifiedAt;
  /**
   * **DEPRECATED** `MetadataField`'s name. This field will be removed. Use `CustomMetadataProperty.name` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.name` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("label")
  private ch.brix.gql.client.frontify.scalars.StringScalar label;
  /**
   * **DEPRECATED** `MetadataField`'s type. This field will be removed. Use `CustomMetadataProperty.type.name` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.type.name` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("type")
  private ch.brix.gql.client.frontify.scalars.StringScalar type;
  /**
   * **DEPRECATED** Possible values for `SELECT` type `MetadataField`. This field will be removed. Use `CustomMetadataProperty.type.options` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.type.options` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("values")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.MetadataFieldValues.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.MetadataFieldValues> values;
  /**
   * **DEPRECATED** Optional default value of the `MetadataField`. This field will be removed. Use `CustomMetadataProperty.defaultValue` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.defaultValue` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("defaultValue")
  private ch.brix.gql.client.frontify.scalars.StringScalar defaultValue;
  /**
   * **DEPRECATED** Allow multiple values in `SELECT` type `MetadataField`. This field will be removed. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("allowMultipleValues")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar allowMultipleValues;
  /**
   * **DEPRECATED** Allow an empty value as a valid `SELECT` type `MetadataField` value. This field will be removed. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("allowEmptyValue")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar allowEmptyValue;
  /**
   * **DEPRECATED** Allow users to search for `MetadataField` values. This field will be removed. Use `CustomMetadataProperty.isSearchable` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.isSearchable` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("isSearchable")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar isSearchable;
  /**
   * **DEPRECATED** Allow users to edit `MetadataField` values. This field will be removed. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("isEditable")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar isEditable;
  /**
   * **DEPRECATED** Show/hide `MetadataField` values. This field will be removed. Use `CustomMetadataProperty.isViewable` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.isViewable` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("isVisible")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar isVisible;
}
