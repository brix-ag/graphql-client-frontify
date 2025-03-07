package ch.brix.gql.client.frontify.input_objects;

public class RemoveAssetLicenseInput extends ch.brix.gql.client.InputObject {
  /**
   * `Asset` Id.
   */
  public RemoveAssetLicenseInput assetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assetId", v);
    return this;
  }
  /**
   * `License` Id.
   */
  public RemoveAssetLicenseInput licenseId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("licenseId", v);
    return this;
  }
}
