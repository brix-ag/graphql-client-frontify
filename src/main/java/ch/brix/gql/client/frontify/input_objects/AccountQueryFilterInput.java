package ch.brix.gql.client.frontify.input_objects;

public class AccountQueryFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * Specify the sources to search in.
   */
  public AccountQueryFilterInput sources(java.util.List<ch.brix.gql.client.frontify.input_objects.AccountQuerySourceInput> v) {
    values.put("sources", v);
    return this;
  }
}
