package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataProperty {
  /**
   * `CustomMetadataProperty` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `User` who created the `CustomMetadataProperty`.
   */
  @com.google.gson.annotations.SerializedName("creator")
  private ch.brix.gql.client.frontify.interfaces.User creator;
  /**
   * `DateTime` of the `CustomMetadataProperty` creation.
   */
  @com.google.gson.annotations.SerializedName("createdAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar createdAt;
  /**
   * `User` who last modified the `CustomMetadataProperty`.
   */
  @com.google.gson.annotations.SerializedName("modifier")
  private ch.brix.gql.client.frontify.interfaces.User modifier;
  /**
   * `DateTime` of the `CustomMetadataProperty`'s last modification.
   */
  @com.google.gson.annotations.SerializedName("modifiedAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar modifiedAt;
  /**
   * `CustomMetadataProperty` name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * `CustomMetadataProperty` type details.
   */
  @com.google.gson.annotations.SerializedName("type")
  private ch.brix.gql.client.frontify.interfaces.CustomMetadataPropertyType type;
  /**
   * `CustomMetadataProperty` help text.
   */
  @com.google.gson.annotations.SerializedName("helpText")
  private ch.brix.gql.client.frontify.scalars.StringScalar helpText;
  /**
   * Indicates if a `CustomMetadataProperty` is required to be defined.
   */
  @com.google.gson.annotations.SerializedName("isRequired")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar isRequired;
  /**
   * `CustomMetadataProperty` value set to newly update `Assets` by default.
   */
  @com.google.gson.annotations.SerializedName("defaultValue")
  private ch.brix.gql.client.frontify.scalars.AnyScalar defaultValue;
}
