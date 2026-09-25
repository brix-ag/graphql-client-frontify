package ch.brix.gql.client.frontify.input_objects;

/**
 * One filter condition for `searchAssets`. Exactly one field must be set.
 */
public class AssetSearchFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * Filter by tags.
   */
  public AssetSearchFilterInput tags(ch.brix.gql.client.frontify.input_objects.AssetArrayFilterInput v) {
    values.put("tags", v);
    return this;
  }
  /**
   * Filter by the collections the asset belongs to.
   */
  public AssetSearchFilterInput collectionId(ch.brix.gql.client.frontify.input_objects.AssetIdArrayFilterInput v) {
    values.put("collectionId", v);
    return this;
  }
  /**
   * Filter by the users/groups the asset is targeted to.
   */
  public AssetSearchFilterInput targetId(ch.brix.gql.client.frontify.input_objects.AssetIdArrayFilterInput v) {
    values.put("targetId", v);
    return this;
  }
  /**
   * Filter by the licenses attached to the asset.
   */
  public AssetSearchFilterInput licenseId(ch.brix.gql.client.frontify.input_objects.AssetIdArrayFilterInput v) {
    values.put("licenseId", v);
    return this;
  }
  /**
   * Filter by file extension.
   */
  public AssetSearchFilterInput extension(ch.brix.gql.client.frontify.input_objects.AssetScalarFilterInput v) {
    values.put("extension", v);
    return this;
  }
  /**
   * Filter by copyright status.
   */
  public AssetSearchFilterInput copyrightStatus(ch.brix.gql.client.frontify.input_objects.CopyrightStatusFilterInput v) {
    values.put("copyrightStatus", v);
    return this;
  }
  /**
   * Filter by image orientation.
   */
  public AssetSearchFilterInput orientation(ch.brix.gql.client.frontify.input_objects.OrientationFilterInput v) {
    values.put("orientation", v);
    return this;
  }
  /**
   * Filter by the id of the user who created the asset.
   */
  public AssetSearchFilterInput creatorId(ch.brix.gql.client.frontify.input_objects.AssetIdScalarFilterInput v) {
    values.put("creatorId", v);
    return this;
  }
  /**
   * Filter by workflow status.
   */
  public AssetSearchFilterInput workflowStatusId(ch.brix.gql.client.frontify.input_objects.WorkflowStatusFilterInput v) {
    values.put("workflowStatusId", v);
    return this;
  }
  /**
   * Filter by creation date.
   */
  public AssetSearchFilterInput createdDate(ch.brix.gql.client.frontify.input_objects.AssetDateFilterInput v) {
    values.put("createdDate", v);
    return this;
  }
  /**
   * Filter by last modification date. Filtering on this while paginating can produce duplicate or missing results for assets that are modified while you're paginating through the results.
   */
  public AssetSearchFilterInput modifiedDate(ch.brix.gql.client.frontify.input_objects.AssetDateFilterInput v) {
    values.put("modifiedDate", v);
    return this;
  }
  /**
   * Filter by the start of the asset's availability window.
   */
  public AssetSearchFilterInput beginDate(ch.brix.gql.client.frontify.input_objects.AssetNullableDateFilterInput v) {
    values.put("beginDate", v);
    return this;
  }
  /**
   * Filter by the end of the asset's availability window.
   */
  public AssetSearchFilterInput expiryDate(ch.brix.gql.client.frontify.input_objects.AssetNullableDateFilterInput v) {
    values.put("expiryDate", v);
    return this;
  }
  /**
   * Filter by the original file creation date.
   */
  public AssetSearchFilterInput fileCreatedDate(ch.brix.gql.client.frontify.input_objects.AssetNullableDateFilterInput v) {
    values.put("fileCreatedDate", v);
    return this;
  }
  /**
   * Filter by whether the asset has a copyright notice.
   */
  public AssetSearchFilterInput hasCopyrightNotice(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("hasCopyrightNotice", v);
    return this;
  }
  /**
   * Filter by whether the asset has missing required metadata.
   */
  public AssetSearchFilterInput hasMissingMetadata(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("hasMissingMetadata", v);
    return this;
  }
  /**
   * Filter by whether the asset is download-protected.
   */
  public AssetSearchFilterInput isDownloadProtected(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isDownloadProtected", v);
    return this;
  }
  /**
   * Filter by whether the asset has a description. `true` matches assets that have one, `false` matches assets that don't.
   */
  public AssetSearchFilterInput hasDescription(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("hasDescription", v);
    return this;
  }
  /**
   * Filter by one custom metadata property's value.
   */
  public AssetSearchFilterInput customMetadataValue(ch.brix.gql.client.frontify.input_objects.CustomMetadataValueFilterInput v) {
    values.put("customMetadataValue", v);
    return this;
  }
  /**
   * Filter by asset availability (validity window relative to now).
   */
  public AssetSearchFilterInput assetAvailability(ch.brix.gql.client.frontify.input_objects.AssetAvailabilityFilterInput v) {
    values.put("assetAvailability", v);
    return this;
  }
}
