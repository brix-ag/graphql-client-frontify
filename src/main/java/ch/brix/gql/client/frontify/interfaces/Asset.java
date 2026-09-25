package ch.brix.gql.client.frontify.interfaces;

/**
 * `AssetInterface` for `Asset` returnable types.
 */
@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.Audio.class, ch.brix.gql.client.frontify.objects.Document.class, ch.brix.gql.client.frontify.objects.EmbeddedContent.class, ch.brix.gql.client.frontify.objects.File.class, ch.brix.gql.client.frontify.objects.Image.class, ch.brix.gql.client.frontify.objects.Video.class})
public interface Asset {
  /**
   * `Asset` id.
   */
  ch.brix.gql.client.frontify.scalars.IdScalar getId();
  /**
   * The `creator` is the `User` who created the asset on Frontify.
   */
  ch.brix.gql.client.frontify.interfaces.User getCreator();
  /**
   * DateTime of the `Asset` creation.
   */
  ch.brix.gql.client.frontify.scalars.DateTimeScalar getCreatedAt();
  /**
   * The `modifier` is the `User` who last modified the asset on Frontify.
   */
  ch.brix.gql.client.frontify.interfaces.User getModifier();
  /**
   * DateTime of the `Asset`'s last modification.
   */
  ch.brix.gql.client.frontify.scalars.DateTimeScalar getModifiedAt();
  /**
   * Title of the `Asset`.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getTitle();
  /**
   * Description of the `Asset`.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getDescription();
  /**
   * Alternative text for the `Asset`. Used by screen readers when the asset is not decorative.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getAlternativeText();
  /**
   * External Id of the `Asset`.
   */
  ch.brix.gql.client.frontify.scalars.IdScalar getExternalId();
  /**
   * List of `Asset`'s tags.
   */
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.Tag.class)
  java.util.List<ch.brix.gql.client.frontify.objects.Tag> getTags();
  /**
   * `Asset` copyright details.
   */
  ch.brix.gql.client.frontify.objects.Copyright getCopyright();
  /**
   * `Asset` will be available only during the defined `DateTime` range.When `null` it represents an unspecified start and/or open-ended date.
   */
  ch.brix.gql.client.frontify.objects.DateTimeRange getAvailability();
  /**
   * `Asset` available until date.
   */
  ch.brix.gql.client.frontify.scalars.DateTimeScalar getExpiresAt();
  /**
   * **DEPRECATED** Metadata values details. This field will be removed. Use `customMetadata` instead. | Date: 2026-07-01
   * This field will be removed. Use `customMetadata` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.MetadataValue.class)
  java.util.List<ch.brix.gql.client.frontify.objects.MetadataValue> getMetadataValues();
  /**
   * Represents the Author of the `Asset`. Example: Photographer Name.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getAuthor();
  /**
   * Represents the conversion status of the `Asset`. Example: FINISHED.
   */
  ch.brix.gql.client.frontify.enums.AssetStatusType getStatus();
  /**
   * Paginated list of `Asset` items related to `Asset`.
   */
  ch.brix.gql.client.frontify.objects.AssetItems getRelatedAssets();
  /**
   * Paginated list of `AssetRevision` items for `Asset`, newest first.
   */
  ch.brix.gql.client.frontify.objects.AssetRevisionItems getRevisions();
  /**
   * Paginated list of `AssetComment` items for `Asset`.
   */
  ch.brix.gql.client.frontify.objects.AssetCommentItems getComments();
  /**
   * `Asset` permissions of the current `User`.
   */
  ch.brix.gql.client.frontify.objects.AssetUserPermissions getCurrentUserPermissions();
  /**
   * List of `CustomMetadataProperty` items and values associated to `Asset`.
   */
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.CustomMetadata.class)
  java.util.List<ch.brix.gql.client.frontify.interfaces.CustomMetadata> getCustomMetadata();
  /**
   * **BETA** The `WorkflowTask` this `Asset` is linked to.
   */
  ch.brix.gql.client.frontify.objects.WorkflowTask getWorkflowTask();
  /**
   * `AssetVariant` items of the asset. Only available for assets in icon and logo libraries.
   */
  ch.brix.gql.client.frontify.objects.AssetVariantItems getVariants();
  /**
   * `Location` of the `Asset`.
   */
  ch.brix.gql.client.frontify.objects.AssetLocation getLocation();
  /**
   * **BETA** Background color of the `Asset` preview.
   */
  ch.brix.gql.client.frontify.objects.RgbaColor getPreviewBackgroundColor();
  /**
   * List of `Asset`'s `Attachments`.
   */
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.AssetAttachment.class)
  java.util.List<ch.brix.gql.client.frontify.objects.AssetAttachment> getAttachments();
  /**
   * **BETA** AI provenance read from the asset's current file, or `null` if none has been extracted yet.
   */
  ch.brix.gql.client.frontify.objects.AssetProvenance getProvenance();
  /**
   * List of `Asset`'s licenses.
   */
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.License.class)
  java.util.List<ch.brix.gql.client.frontify.objects.License> getLicenses();
  /**
   * **BETA** List of `Target` items linked to `Asset`
   */
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.Target.class)
  java.util.List<ch.brix.gql.client.frontify.objects.Target> getTargets();
}
