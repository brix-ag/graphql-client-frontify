package ch.brix.gql.client.frontify.builders;

public class On_Tag extends ch.brix.gql.client.TypeBuilder {
  public On_Tag() {
    super(new ch.brix.gql.client.On("Tag"));
  }
  /**
   * `Tag` value.
   */
  public On_Tag value() {
    _add_field("value");
    return this;
  }
  /**
   * `Tag` source indicating how the tag was linked to the `Asset`. AUTO: created by AI `Asset` recognition. MANUAL: manually added.
   */
  public On_Tag source() {
    _add_field("source");
    return this;
  }
}
