package ch.brix.gql.client.frontify.input_objects;

/**
 * Sort option for `searchAssets`.
 */
public class AssetSearchSortInput extends ch.brix.gql.client.InputObject {
  /**
   * The field to sort by. Sorting by `LAST_MODIFIED` while paginating can produce duplicate or missing results for assets that are modified while you're paginating through the results.
   */
  public AssetSearchSortInput key(ch.brix.gql.client.frontify.enums.AssetSearchSortKey v) {
    values.put("key", v);
    return this;
  }
  /**
   * The sort direction.
   */
  public AssetSearchSortInput direction(ch.brix.gql.client.frontify.enums.AssetSearchSortDirection v) {
    values.put("direction", v);
    return this;
  }
}
