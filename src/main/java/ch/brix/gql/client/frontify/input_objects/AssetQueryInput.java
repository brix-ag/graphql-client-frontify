package ch.brix.gql.client.frontify.input_objects;

public class AssetQueryInput extends ch.brix.gql.client.InputObject {
  /**
   * Use filters to reduce the set of matched `Asset` items by complex filtering.
   */
  public AssetQueryInput filter(ch.brix.gql.client.frontify.input_objects.AssetQueryFilterInput v) {
    values.put("filter", v);
    return this;
  }
  /**
   * Limit the result set to a specific `Folder` of this `Library`.
   */
  public AssetQueryInput inFolder(ch.brix.gql.client.frontify.input_objects.AssetQueryInFolderInput v) {
    values.put("inFolder", v);
    return this;
  }
  /**
   * Sort set of the matched `AssetItems`.
   */
  public AssetQueryInput sortBy(ch.brix.gql.client.frontify.enums.AssetQueryFilterSortType v) {
    values.put("sortBy", v);
    return this;
  }
  /**
   * Limit the result set by the externalId of an `Asset`.
   */
  public AssetQueryInput externalId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("externalId", v);
    return this;
  }
  /**
   * Limit the result set by the search term.
   */
  public AssetQueryInput search(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("search", v);
    return this;
  }
  /**
   * **DEPRECATED** Filter the `Asset` types present in the result set. This field will be removed. Use `types` instead. | Date: 2022-07-01T00:00:00.000+00:00
   */
  public AssetQueryInput type(java.util.List<ch.brix.gql.client.frontify.enums.AssetType> v) {
    values.put("type", v);
    return this;
  }
  /**
   * Limit the result set by the `Asset` types.
   */
  public AssetQueryInput types(java.util.List<ch.brix.gql.client.frontify.enums.AssetType> v) {
    values.put("types", v);
    return this;
  }
}
