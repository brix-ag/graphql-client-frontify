package ch.brix.gql.client.frontify.input_objects;

public class AssetQueryFilterConditionInput extends ch.brix.gql.client.InputObject {
  /**
   * Defines which property of the `Asset` is compared to the provided value.
   */
  public AssetQueryFilterConditionInput type(ch.brix.gql.client.frontify.enums.ConditionType v) {
    values.put("type", v);
    return this;
  }
  /**
   * Defines how the value of the `Asset` is compared to the provided value.
   */
  @ch.brix.gql.client.DefaultValue("IS")
  public AssetQueryFilterConditionInput operator(ch.brix.gql.client.frontify.enums.ConditionOperator v) {
    values.put("operator", v);
    return this;
  }
  /**
   * The value which is compared against the property of the `Asset`.
   */
  public AssetQueryFilterConditionInput value(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("value", v);
    return this;
  }
  /**
   * **REQUIRED** for type `METADATA_VALUE` to identify which metadata field it is compared against. You can find all available `metadataFields` on the project.
   */
  public AssetQueryFilterConditionInput metadataFieldId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("metadataFieldId", v);
    return this;
  }
  /**
   * **REQUIRED** for type `CUSTOM_METADATA_VALUE` to identify which `CustomMetadataProperty` it is compared against. You can find all available `CustomMetadataProperty` on the project.
   */
  public AssetQueryFilterConditionInput customMetadataPropertyId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("customMetadataPropertyId", v);
    return this;
  }
}
