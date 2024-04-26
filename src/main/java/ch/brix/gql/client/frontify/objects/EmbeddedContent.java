package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class EmbeddedContent implements ch.brix.gql.client.frontify.interfaces.Node, ch.brix.gql.client.frontify.interfaces.Asset {
  /**
   * `Asset` id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * The `User` who created the `Asset`.
   */
  @com.google.gson.annotations.SerializedName("creator")
  private ch.brix.gql.client.frontify.interfaces.User creator;
  /**
   * `DateTime` of the `Asset` creation.
   */
  @com.google.gson.annotations.SerializedName("createdAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar createdAt;
  /**
   * The `User` who last modified the `Asset`.
   */
  @com.google.gson.annotations.SerializedName("modifier")
  private ch.brix.gql.client.frontify.interfaces.User modifier;
  /**
   * `DateTime` of the `Asset` last modification.
   */
  @com.google.gson.annotations.SerializedName("modifiedAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar modifiedAt;
  /**
   * Title of the `Asset`.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
  /**
   * Description of the `Asset`.
   */
  @com.google.gson.annotations.SerializedName("description")
  private ch.brix.gql.client.frontify.scalars.StringScalar description;
  /**
   * `Attachment` items linked to `Asset`.
   */
  @com.google.gson.annotations.SerializedName("attachments")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.AssetAttachment.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.AssetAttachment> attachments;
  /**
   * External Id of the `Asset`.
   */
  @com.google.gson.annotations.SerializedName("externalId")
  private ch.brix.gql.client.frontify.scalars.IdScalar externalId;
  /**
   * List of `Tag` items linked to `Asset`
   */
  @com.google.gson.annotations.SerializedName("tags")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.Tag.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.Tag> tags;
  /**
   * **DEPRECATED** `MetadataValue` items linked to `Asset`. This field will be removed. Use `customMetadata` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `customMetadata` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("metadataValues")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.MetadataValue.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.MetadataValue> metadataValues;
  /**
   * `ExternalProduct` items linked to `Asset`.
   */
  @com.google.gson.annotations.SerializedName("externalProducts")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.ExternalProduct.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.ExternalProduct> externalProducts;
  /**
   * `Asset` copyright details.
   */
  @com.google.gson.annotations.SerializedName("copyright")
  private ch.brix.gql.client.frontify.objects.Copyright copyright;
  /**
   * `Asset` expiry date.
   */
  @com.google.gson.annotations.SerializedName("expiresAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar expiresAt;
  /**
   * `License` items linked to `Asset`.
   */
  @com.google.gson.annotations.SerializedName("licenses")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.License.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.License> licenses;
  /**
   * Represents the Author of the `Asset`. Example: Photographer Name.
   */
  @com.google.gson.annotations.SerializedName("author")
  private ch.brix.gql.client.frontify.scalars.StringScalar author;
  /**
   * Represents the conversion status of the `Asset`. Example: FINISHED.
   */
  @com.google.gson.annotations.SerializedName("status")
  private ch.brix.gql.client.frontify.enums.AssetStatusType status;
  /**
   * Paginated list of `Asset` items related to `Asset`.
   */
  @com.google.gson.annotations.SerializedName("relatedAssets")
  private ch.brix.gql.client.frontify.objects.AssetItems relatedAssets;
  /**
   * Paginated list of `AssetComment` items for `Asset`.
   */
  @com.google.gson.annotations.SerializedName("comments")
  private ch.brix.gql.client.frontify.objects.AssetCommentItems comments;
  /**
   * Current `User` `Asset` permissions.
   */
  @com.google.gson.annotations.SerializedName("currentUserPermissions")
  private ch.brix.gql.client.frontify.objects.AssetUserPermissions currentUserPermissions;
  /**
   * List of `CustomMetadataProperty` items and values associated to `Asset`.
   */
  @com.google.gson.annotations.SerializedName("customMetadata")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.CustomMetadata.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.CustomMetadata> customMetadata;
  /**
   * **BETA** The `WorkflowTask` this `Asset` is linked to.
   */
  @com.google.gson.annotations.SerializedName("workflowTask")
  private ch.brix.gql.client.frontify.objects.WorkflowTask workflowTask;
  /**
   * Preview of the embedded content. If the preview is not available, an svg icon will be returned.
   */
  @com.google.gson.annotations.SerializedName("previewUrl")
  private ch.brix.gql.client.frontify.scalars.UrlScalar previewUrl;
  /**
   * Provides a `Url` for the custom user defined thumbnail or a system generated one when possible.
   */
  @com.google.gson.annotations.SerializedName("thumbnailUrl")
  private ch.brix.gql.client.frontify.scalars.UrlScalar thumbnailUrl;
}
