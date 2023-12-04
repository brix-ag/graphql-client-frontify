package ch.brix.gql.client.frontify.input_objects;

public class AddAssetMetadataFieldValueInput extends ch.brix.gql.client.InputObject {
  /**
   * `Asset` Id.
   */
  public AddAssetMetadataFieldValueInput assetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assetId", v);
    return this;
  }
  /**
   * Metadata field Id.
   */
  public AddAssetMetadataFieldValueInput metadataFieldId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("metadataFieldId", v);
    return this;
  }
  /**
   * Value to be assigned to `Asset` and `Metadata Field`.
   */
  public AddAssetMetadataFieldValueInput value(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("value", v);
    return this;
  }
}
