package ch.brix.gql.client.frontify.input_objects;

public class AddAssetLicenseInput extends ch.brix.gql.client.InputObject {
  /**
   * `Asset` Id.
   */
  public AddAssetLicenseInput assetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assetId", v);
    return this;
  }
  /**
   * `License` Id.
   */
  public AddAssetLicenseInput licenseId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("licenseId", v);
    return this;
  }
}
