package ch.brix.gql.client.frontify.input_objects;

public class UpdateCollectionInput extends ch.brix.gql.client.InputObject {
  /**
   * `Collection` Id.
   */
  public UpdateCollectionInput collectionId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("collectionId", v);
    return this;
  }
  /**
   * `Collection` data.
   */
  public UpdateCollectionInput data(ch.brix.gql.client.frontify.input_objects.UpdateCollectionDataInput v) {
    values.put("data", v);
    return this;
  }
}
