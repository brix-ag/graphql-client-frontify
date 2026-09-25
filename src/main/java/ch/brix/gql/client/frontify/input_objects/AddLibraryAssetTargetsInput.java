package ch.brix.gql.client.frontify.input_objects;

public class AddLibraryAssetTargetsInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `Asset` Id. Limited to 100 Ids per request. Assets must belong to the same library.
   */
  public AddLibraryAssetTargetsInput assetIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("assetIds", v);
    return this;
  }
  /**
   * **BETA** `Target` Id. Limited to 100 Ids per request.
   */
  public AddLibraryAssetTargetsInput targetIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("targetIds", v);
    return this;
  }
}
