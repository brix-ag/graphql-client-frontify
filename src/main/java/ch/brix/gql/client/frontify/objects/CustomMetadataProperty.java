package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataProperty implements ch.brix.gql.client.frontify.interfaces.Node {
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
   * **BETA** Indicates if a `CustomMetadataProperty` is searchable.
   */
  @com.google.gson.annotations.SerializedName("isSearchable")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar isSearchable;
  /**
   * **BETA** Indicates if a `CustomMetadataProperty` is viewable. This is a stored flag that hides the property from users entirely, independent of the current user's access. See `currentUserPermissions` for the per-request, access-rule-based canEdit/canAdmin checks.
   */
  @com.google.gson.annotations.SerializedName("isViewable")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar isViewable;
  /**
   * `CustomMetadataProperty` value set to newly update `Assets` by default.
   */
  @com.google.gson.annotations.SerializedName("defaultValue")
  private ch.brix.gql.client.frontify.scalars.AnyScalar defaultValue;
  /**
   * **BETA** `CustomMetadataPropertyDependency` details.
   */
  @com.google.gson.annotations.SerializedName("dependency")
  private ch.brix.gql.client.frontify.interfaces.CustomMetadataPropertyDependency dependency;
  /**
   * **BETA** `CustomMetadataProperty` Ids that cannot be used as dependee properties.
   */
  @com.google.gson.annotations.SerializedName("forbiddenDependeePropertyIds")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.scalars.IdScalar.class)
  private java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> forbiddenDependeePropertyIds;
  /**
   * **BETA** `CustomMetadataProperty` permissions.
   */
  @com.google.gson.annotations.SerializedName("permissions")
  private ch.brix.gql.client.frontify.objects.CustomMetadataPropertyPermissions permissions;
}
