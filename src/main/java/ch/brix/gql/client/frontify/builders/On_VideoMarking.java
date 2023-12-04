package ch.brix.gql.client.frontify.builders;

public class On_VideoMarking extends ch.brix.gql.client.TypeBuilder {
  public On_VideoMarking() {
    super(new ch.brix.gql.client.On("VideoMarking"));
  }
  /**
   * The `Marking` position in percent relative to the top left corner of the `Asset`.
   */
  public On_VideoMarking position(VideoMarking_position callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `Marking` dimensions in percent of `Asset` dimensions.
   */
  public On_VideoMarking dimensions(VideoMarking_dimensions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The timeframe of the `Marking`. Applicable to `Video` type `Asset` items only.
   */
  public On_VideoMarking timeframe(VideoMarking_timeframe callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
