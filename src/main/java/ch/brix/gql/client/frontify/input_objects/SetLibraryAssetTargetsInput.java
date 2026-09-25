package ch.brix.gql.client.frontify.input_objects;

public class SetLibraryAssetTargetsInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `Asset` Id. Limited to 100 Ids per request. Assets must belong to the same library.
   */
  public SetLibraryAssetTargetsInput assetIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("assetIds", v);
    return this;
  }
  /**
   * **BETA** `Target` Id. Limited to 100 Ids per request.
   */
  public SetLibraryAssetTargetsInput targetIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("targetIds", v);
    return this;
  }
}
