package ch.brix.gql.client.frontify.input_objects;

/**
 * Arguments for `searchAssets`.
 */
public class AssetSearchInput extends ch.brix.gql.client.InputObject {
  /**
   * How to sort the results.
   */
  public AssetSearchInput sortBy(ch.brix.gql.client.frontify.input_objects.AssetSearchSortInput v) {
    values.put("sortBy", v);
    return this;
  }
  /**
   * Maximum number of results to return.
   */
  public AssetSearchInput limit(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("limit", v);
    return this;
  }
  /**
   * Filter conditions to apply. All entries are combined with AND; provide the same key more than once to combine several conditions on it.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public AssetSearchInput filters(java.util.List<ch.brix.gql.client.frontify.input_objects.AssetSearchFilterInput> v) {
    values.put("filters", v);
    return this;
  }
  /**
   * Free-text search term. When set, only the first 10,000 matching assets are reachable via pagination.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public AssetSearchInput searchTerm(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("searchTerm", v);
    return this;
  }
  /**
   * Restrict the search to this folder.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public AssetSearchInput folderId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("folderId", v);
    return this;
  }
  /**
   * Whether to also search subfolders — of `folderId` if set, otherwise of the library/workspace root. Defaults to `true`.
   */
  @ch.brix.gql.client.DefaultValue("true")
  public AssetSearchInput isRecursive(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isRecursive", v);
    return this;
  }
  /**
   * Pagination cursor from a previous page. `filters` and `sortBy` must be identical to the call that produced it — changing either between pages is not detected and yields undefined results.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public AssetSearchInput cursor(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("cursor", v);
    return this;
  }
}
