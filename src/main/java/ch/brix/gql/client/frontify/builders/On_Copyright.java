package ch.brix.gql.client.frontify.builders;

public class On_Copyright extends ch.brix.gql.client.TypeBuilder {
  public On_Copyright() {
    super(new ch.brix.gql.client.On("Copyright"));
  }
  /**
   * Asset `copyright` status.
   */
  public On_Copyright status() {
    _add_field("status");
    return this;
  }
  /**
   * Asset `copyright` notice.
   */
  public On_Copyright notice() {
    _add_field("notice");
    return this;
  }
}
