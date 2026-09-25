package ch.brix.gql.client.frontify.input_objects;

public class DeleteServiceAppInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The ID of the ServiceApp to be removed
   */
  public DeleteServiceAppInput serviceAppId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("serviceAppId", v);
    return this;
  }
}
