package ch.brix.gql.client.frontify.input_objects;

/**
 * One `Asset`'s requested changes.
 */
public class AssetUpdateEntryInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `Asset` Id.
   */
  public AssetUpdateEntryInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** The fields to change on this `Asset`.
   */
  public AssetUpdateEntryInput data(ch.brix.gql.client.frontify.input_objects.AssetUpdateEntryDataInput v) {
    values.put("data", v);
    return this;
  }
}
