package ch.brix.gql.client.frontify.builders;

public class On_Node extends ch.brix.gql.client.TypeBuilder {
  public On_Node() {
    super(new ch.brix.gql.client.On("Node"));
  }
  /**
   * `Node` Id.
   */
  public On_Node id() {
    _add_field("id");
    return this;
  }
}
