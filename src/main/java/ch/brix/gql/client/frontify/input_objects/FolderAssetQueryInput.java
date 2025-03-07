package ch.brix.gql.client.frontify.input_objects;

public class FolderAssetQueryInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Sort order of matched results.
   */
  public FolderAssetQueryInput sortBy(ch.brix.gql.client.frontify.enums.AssetQueryFilterSortType v) {
    values.put("sortBy", v);
    return this;
  }
}
